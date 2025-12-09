// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationSsoFormParamsRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用模板创建参数，应用创建来源为模板时才可以指定</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationTemplateParams")
    public java.util.List<UpdateApplicationSsoFormParamsRequestApplicationTemplateParams> applicationTemplateParams;

    /**
     * <p>IDaaS EIAM的实例id</p>
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
         * <p>应用模板创建参数具体名称</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunUid</p>
         */
        @NameInMap("TemplateParamName")
        public String templateParamName;

        /**
         * <p>应用模板创建参数真实的取值</p>
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
