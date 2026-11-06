// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceGroupAgentModelSettingsResponseBody extends TeaModel {
    /**
     * <p>The list of model settings for resource groups. One record is returned for each resource group ID specified in the request. If a resource group is not associated with a model group under the specified agent platform and provider, ModelTemplateId and ModelTemplateName are empty.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetResourceGroupAgentModelSettingsResponseBodyData> data;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetResourceGroupAgentModelSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupAgentModelSettingsResponseBody self = new GetResourceGroupAgentModelSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupAgentModelSettingsResponseBody setData(java.util.List<GetResourceGroupAgentModelSettingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetResourceGroupAgentModelSettingsResponseBodyData> getData() {
        return this.data;
    }

    public GetResourceGroupAgentModelSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupAgentModelSettingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetResourceGroupAgentModelSettingsResponseBodyData extends TeaModel {
        /**
         * <p>The model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <p>The model group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default model group</p>
         */
        @NameInMap("ModelTemplateName")
        public String modelTemplateName;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetResourceGroupAgentModelSettingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupAgentModelSettingsResponseBodyData self = new GetResourceGroupAgentModelSettingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupAgentModelSettingsResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public GetResourceGroupAgentModelSettingsResponseBodyData setModelTemplateName(String modelTemplateName) {
            this.modelTemplateName = modelTemplateName;
            return this;
        }
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        public GetResourceGroupAgentModelSettingsResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
