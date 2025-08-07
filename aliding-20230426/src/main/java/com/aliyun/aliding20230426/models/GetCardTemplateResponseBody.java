// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCardTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("commonVariableList")
    public java.util.List<GetCardTemplateResponseBodyCommonVariableList> commonVariableList;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetCardTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardTemplateResponseBody self = new GetCardTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardTemplateResponseBody setCommonVariableList(java.util.List<GetCardTemplateResponseBodyCommonVariableList> commonVariableList) {
        this.commonVariableList = commonVariableList;
        return this;
    }
    public java.util.List<GetCardTemplateResponseBodyCommonVariableList> getCommonVariableList() {
        return this.commonVariableList;
    }

    public GetCardTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardTemplateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetCardTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetCardTemplateResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetCardTemplateResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetCardTemplateResponseBodyCommonVariableList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>卡片摘要</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>lastMessage</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IfPrivateFiled")
        public Boolean ifPrivateFiled;

        /**
         * <strong>example:</strong>
         * <p>lastMessage</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCardTemplateResponseBodyCommonVariableList build(java.util.Map<String, ?> map) throws Exception {
            GetCardTemplateResponseBodyCommonVariableList self = new GetCardTemplateResponseBodyCommonVariableList();
            return TeaModel.build(map, self);
        }

        public GetCardTemplateResponseBodyCommonVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCardTemplateResponseBodyCommonVariableList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCardTemplateResponseBodyCommonVariableList setIfPrivateFiled(Boolean ifPrivateFiled) {
            this.ifPrivateFiled = ifPrivateFiled;
            return this;
        }
        public Boolean getIfPrivateFiled() {
            return this.ifPrivateFiled;
        }

        public GetCardTemplateResponseBodyCommonVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCardTemplateResponseBodyCommonVariableList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
