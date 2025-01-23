// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionsForProjectResponseBody extends TeaModel {
    /**
     * <p>The extensions.</p>
     */
    @NameInMap("Extensions")
    public java.util.List<ListEnabledExtensionsForProjectResponseBodyExtensions> extensions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F2CA7ED-27E5-59EA-A8C4-F1F7A1FF0B22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnabledExtensionsForProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionsForProjectResponseBody self = new ListEnabledExtensionsForProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionsForProjectResponseBody setExtensions(java.util.List<ListEnabledExtensionsForProjectResponseBodyExtensions> extensions) {
        this.extensions = extensions;
        return this;
    }
    public java.util.List<ListEnabledExtensionsForProjectResponseBodyExtensions> getExtensions() {
        return this.extensions;
    }

    public ListEnabledExtensionsForProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnabledExtensionsForProjectResponseBodyExtensions extends TeaModel {
        /**
         * <p>The creator of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>3444434343555</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The unique code of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>a94a8e23bc0b4dfab9a5e4d2f374d645</p>
         */
        @NameInMap("ExtensionCode")
        public String extensionCode;

        /**
         * <p>The description of the extension.</p>
         */
        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        /**
         * <p>The name of the extension.</p>
         */
        @NameInMap("ExtensionName")
        public String extensionName;

        /**
         * <p>The modifier of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>34452335611988</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21323672*******55500</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameter settings of the extension. For more information, see <a href="https://help.aliyun.com/document_detail/405354.html">Configure extension parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>extension.fileType.23.deploy-file.enabled=true</p>
         */
        @NameInMap("ParameterSetting")
        public String parameterSetting;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>529889518659842</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListEnabledExtensionsForProjectResponseBodyExtensions build(java.util.Map<String, ?> map) throws Exception {
            ListEnabledExtensionsForProjectResponseBodyExtensions self = new ListEnabledExtensionsForProjectResponseBodyExtensions();
            return TeaModel.build(map, self);
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setExtensionCode(String extensionCode) {
            this.extensionCode = extensionCode;
            return this;
        }
        public String getExtensionCode() {
            return this.extensionCode;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setExtensionDesc(String extensionDesc) {
            this.extensionDesc = extensionDesc;
            return this;
        }
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setExtensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }
        public String getExtensionName() {
            return this.extensionName;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setParameterSetting(String parameterSetting) {
            this.parameterSetting = parameterSetting;
            return this;
        }
        public String getParameterSetting() {
            return this.parameterSetting;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
