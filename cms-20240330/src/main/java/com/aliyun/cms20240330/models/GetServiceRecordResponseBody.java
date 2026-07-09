// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceRecordResponseBody extends TeaModel {
    /**
     * <p>The record.</p>
     */
    @NameInMap("record")
    public GetServiceRecordResponseBodyRecord record;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRecordResponseBody self = new GetServiceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceRecordResponseBody setRecord(GetServiceRecordResponseBodyRecord record) {
        this.record = record;
        return this;
    }
    public GetServiceRecordResponseBodyRecord getRecord() {
        return this.record;
    }

    public GetServiceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceRecordResponseBodyRecord extends TeaModel {
        /**
         * <p>The entry content in JSON string format. The returned content varies depending on the recordType.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;proj-xtrace-16c988dcfe21fcb73c5e6f234927d998-cn-hangzhou&quot;,&quot;storeName&quot;:&quot;app-biz-log&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;bindType&quot;:&quot;logstore&quot;,&quot;traceIdRelateField&quot;:&quot;&quot;}</p>
         */
        @NameInMap("recordContent")
        public String recordContent;

        /**
         * <p>The type of the linked entry. Currently supported values:
         * logCorrelation: indicates application log association.</p>
         * 
         * <strong>example:</strong>
         * <p>logCorrelation</p>
         */
        @NameInMap("recordType")
        public String recordType;

        /**
         * <p>The unique identifier of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ckj0xn6ma3@b96491402f8e1f15a8c79</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1610600919225911-cn-beijing</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetServiceRecordResponseBodyRecord build(java.util.Map<String, ?> map) throws Exception {
            GetServiceRecordResponseBodyRecord self = new GetServiceRecordResponseBodyRecord();
            return TeaModel.build(map, self);
        }

        public GetServiceRecordResponseBodyRecord setRecordContent(String recordContent) {
            this.recordContent = recordContent;
            return this;
        }
        public String getRecordContent() {
            return this.recordContent;
        }

        public GetServiceRecordResponseBodyRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetServiceRecordResponseBodyRecord setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetServiceRecordResponseBodyRecord setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
