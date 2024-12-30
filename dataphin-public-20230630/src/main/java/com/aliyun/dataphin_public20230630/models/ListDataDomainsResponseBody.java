// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataDomainsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDataDomainsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataDomainsResponseBody self = new ListDataDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataDomainsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataDomainsResponseBody setData(ListDataDomainsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataDomainsResponseBodyData getData() {
        return this.data;
    }

    public ListDataDomainsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataDomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataDomainsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataDomainsResponseBodyDataDataDomainList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <strong>example:</strong>
         * <p>545844456</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <strong>example:</strong>
         * <p>dm_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>10232311</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static ListDataDomainsResponseBodyDataDataDomainList build(java.util.Map<String, ?> map) throws Exception {
            ListDataDomainsResponseBodyDataDataDomainList self = new ListDataDomainsResponseBodyDataDataDomainList();
            return TeaModel.build(map, self);
        }

        public ListDataDomainsResponseBodyDataDataDomainList setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListDataDomainsResponseBodyDataDataDomainList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class ListDataDomainsResponseBodyData extends TeaModel {
        @NameInMap("DataDomainList")
        public java.util.List<ListDataDomainsResponseBodyDataDataDomainList> dataDomainList;

        public static ListDataDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataDomainsResponseBodyData self = new ListDataDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataDomainsResponseBodyData setDataDomainList(java.util.List<ListDataDomainsResponseBodyDataDataDomainList> dataDomainList) {
            this.dataDomainList = dataDomainList;
            return this;
        }
        public java.util.List<ListDataDomainsResponseBodyDataDataDomainList> getDataDomainList() {
            return this.dataDomainList;
        }

    }

}
