// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupTagListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The tag information returned if the call succeeds. For more information, see the following <strong>GroupTagInfo</strong> parameter.</p>
     */
    @NameInMap("Data")
    public QueryDeviceGroupTagListResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>214154FF-9D47-4E3F-AAAD-F4CE67F41060</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceGroupTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupTagListResponseBody self = new QueryDeviceGroupTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupTagListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupTagListResponseBody setData(QueryDeviceGroupTagListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupTagListResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceGroupTagListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupTagListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceGroupTagListResponseBodyDataGroupTagInfo extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>room1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>bulb</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceGroupTagListResponseBodyDataGroupTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseBodyDataGroupTagInfo self = new QueryDeviceGroupTagListResponseBodyDataGroupTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseBodyDataGroupTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceGroupTagListResponseBodyDataGroupTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceGroupTagListResponseBodyData extends TeaModel {
        @NameInMap("GroupTagInfo")
        public java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> groupTagInfo;

        public static QueryDeviceGroupTagListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseBodyData self = new QueryDeviceGroupTagListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseBodyData setGroupTagInfo(java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> groupTagInfo) {
            this.groupTagInfo = groupTagInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> getGroupTagInfo() {
            return this.groupTagInfo;
        }

    }

}
