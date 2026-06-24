// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveResourceGroupModelTemplateResponseBody extends TeaModel {
    /**
     * <p>The removal results.</p>
     */
    @NameInMap("Data")
    public java.util.List<RemoveResourceGroupModelTemplateResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static RemoveResourceGroupModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveResourceGroupModelTemplateResponseBody self = new RemoveResourceGroupModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveResourceGroupModelTemplateResponseBody setData(java.util.List<RemoveResourceGroupModelTemplateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RemoveResourceGroupModelTemplateResponseBodyData> getData() {
        return this.data;
    }

    public RemoveResourceGroupModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveResourceGroupModelTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class RemoveResourceGroupModelTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The error code returned if the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.resourceGroupIds</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message returned if the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter resourceGroupIds is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveResourceGroupModelTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveResourceGroupModelTemplateResponseBodyData self = new RemoveResourceGroupModelTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveResourceGroupModelTemplateResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveResourceGroupModelTemplateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveResourceGroupModelTemplateResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public RemoveResourceGroupModelTemplateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
