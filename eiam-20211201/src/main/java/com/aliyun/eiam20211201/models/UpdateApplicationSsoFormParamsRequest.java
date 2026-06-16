// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationSsoFormParamsRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The parameters for creating the application template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationTemplateParams")
    public java.util.List<UpdateApplicationSsoFormParamsRequestApplicationTemplateParams> applicationTemplateParams;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateApplicationSsoFormParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationSsoFormParamsRequest self = new UpdateApplicationSsoFormParamsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationSsoFormParamsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationSsoFormParamsRequest setApplicationTemplateParams(java.util.List<UpdateApplicationSsoFormParamsRequestApplicationTemplateParams> applicationTemplateParams) {
        this.applicationTemplateParams = applicationTemplateParams;
        return this;
    }
    public java.util.List<UpdateApplicationSsoFormParamsRequestApplicationTemplateParams> getApplicationTemplateParams() {
        return this.applicationTemplateParams;
    }

    public UpdateApplicationSsoFormParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateApplicationSsoFormParamsRequestApplicationTemplateParams extends TeaModel {
        /**
         * <p>The name of a parameter for creating the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunUid</p>
         */
        @NameInMap("TemplateParamName")
        public String templateParamName;

        /**
         * <p>The value of the parameter for creating the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("TemplateParamValue")
        public String templateParamValue;

        public static UpdateApplicationSsoFormParamsRequestApplicationTemplateParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationSsoFormParamsRequestApplicationTemplateParams self = new UpdateApplicationSsoFormParamsRequestApplicationTemplateParams();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationSsoFormParamsRequestApplicationTemplateParams setTemplateParamName(String templateParamName) {
            this.templateParamName = templateParamName;
            return this;
        }
        public String getTemplateParamName() {
            return this.templateParamName;
        }

        public UpdateApplicationSsoFormParamsRequestApplicationTemplateParams setTemplateParamValue(String templateParamValue) {
            this.templateParamValue = templateParamValue;
            return this;
        }
        public String getTemplateParamValue() {
            return this.templateParamValue;
        }

    }

}
