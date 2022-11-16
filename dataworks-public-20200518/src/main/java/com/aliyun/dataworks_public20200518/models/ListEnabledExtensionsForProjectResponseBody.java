// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionsForProjectResponseBody extends TeaModel {
    @NameInMap("Extensions")
    public java.util.List<ListEnabledExtensionsForProjectResponseBodyExtensions> extensions;

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
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("ExtensionCode")
        public String extensionCode;

        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        @NameInMap("ExtensionName")
        public String extensionName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParameterSetting")
        public String parameterSetting;

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

        public ListEnabledExtensionsForProjectResponseBodyExtensions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListEnabledExtensionsForProjectResponseBodyExtensions setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
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
