// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBizUnitsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBizUnitsResponseBodyData data;

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

    public static ListBizUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBizUnitsResponseBody self = new ListBizUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBizUnitsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBizUnitsResponseBody setData(ListBizUnitsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBizUnitsResponseBodyData getData() {
        return this.data;
    }

    public ListBizUnitsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBizUnitsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBizUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBizUnitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBizUnitsResponseBodyDataBizUnitListAccountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("Id")
        public String id;

        public static ListBizUnitsResponseBodyDataBizUnitListAccountList build(java.util.Map<String, ?> map) throws Exception {
            ListBizUnitsResponseBodyDataBizUnitListAccountList self = new ListBizUnitsResponseBodyDataBizUnitListAccountList();
            return TeaModel.build(map, self);
        }

        public ListBizUnitsResponseBodyDataBizUnitListAccountList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListBizUnitsResponseBodyDataBizUnitList extends TeaModel {
        @NameInMap("AccountList")
        public java.util.List<ListBizUnitsResponseBodyDataBizUnitListAccountList> accountList;

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
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

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
         * <p>icon-e-commerce</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>101001201</p>
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
         * <p>DEV_PROD</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>test01</p>
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

        public static ListBizUnitsResponseBodyDataBizUnitList build(java.util.Map<String, ?> map) throws Exception {
            ListBizUnitsResponseBodyDataBizUnitList self = new ListBizUnitsResponseBodyDataBizUnitList();
            return TeaModel.build(map, self);
        }

        public ListBizUnitsResponseBodyDataBizUnitList setAccountList(java.util.List<ListBizUnitsResponseBodyDataBizUnitListAccountList> accountList) {
            this.accountList = accountList;
            return this;
        }
        public java.util.List<ListBizUnitsResponseBodyDataBizUnitListAccountList> getAccountList() {
            return this.accountList;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListBizUnitsResponseBodyDataBizUnitList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

    }

    public static class ListBizUnitsResponseBodyData extends TeaModel {
        @NameInMap("BizUnitList")
        public java.util.List<ListBizUnitsResponseBodyDataBizUnitList> bizUnitList;

        public static ListBizUnitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBizUnitsResponseBodyData self = new ListBizUnitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBizUnitsResponseBodyData setBizUnitList(java.util.List<ListBizUnitsResponseBodyDataBizUnitList> bizUnitList) {
            this.bizUnitList = bizUnitList;
            return this;
        }
        public java.util.List<ListBizUnitsResponseBodyDataBizUnitList> getBizUnitList() {
            return this.bizUnitList;
        }

    }

}
