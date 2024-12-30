// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizUnitInfoResponseBody extends TeaModel {
    @NameInMap("BizUnitInfo")
    public GetBizUnitInfoResponseBodyBizUnitInfo bizUnitInfo;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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

    public static GetBizUnitInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizUnitInfoResponseBody self = new GetBizUnitInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizUnitInfoResponseBody setBizUnitInfo(GetBizUnitInfoResponseBodyBizUnitInfo bizUnitInfo) {
        this.bizUnitInfo = bizUnitInfo;
        return this;
    }
    public GetBizUnitInfoResponseBodyBizUnitInfo getBizUnitInfo() {
        return this.bizUnitInfo;
    }

    public GetBizUnitInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBizUnitInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBizUnitInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBizUnitInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizUnitInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizUnitInfoResponseBodyBizUnitInfoAccountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetBizUnitInfoResponseBodyBizUnitInfoAccountList build(java.util.Map<String, ?> map) throws Exception {
            GetBizUnitInfoResponseBodyBizUnitInfoAccountList self = new GetBizUnitInfoResponseBodyBizUnitInfoAccountList();
            return TeaModel.build(map, self);
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoAccountList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList build(java.util.Map<String, ?> map) throws Exception {
            GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList self = new GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList();
            return TeaModel.build(map, self);
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList build(java.util.Map<String, ?> map) throws Exception {
            GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList self = new GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList();
            return TeaModel.build(map, self);
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetBizUnitInfoResponseBodyBizUnitInfoEnvList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试数据板块001_开发</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("EnvName")
        public String envName;

        /**
         * <strong>example:</strong>
         * <p>LD_test001_dev</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetBizUnitInfoResponseBodyBizUnitInfoEnvList build(java.util.Map<String, ?> map) throws Exception {
            GetBizUnitInfoResponseBodyBizUnitInfoEnvList self = new GetBizUnitInfoResponseBodyBizUnitInfoEnvList();
            return TeaModel.build(map, self);
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoEnvList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoEnvList setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfoEnvList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBizUnitInfoResponseBodyBizUnitInfo extends TeaModel {
        @NameInMap("AccountList")
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoAccountList> accountList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizObjectCount")
        public Integer bizObjectCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizProcessCount")
        public Integer bizProcessCount;

        @NameInMap("BusinessLeaderList")
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList> businessLeaderList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataDomainCount")
        public Integer dataDomainCount;

        @NameInMap("DataLeaderList")
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList> dataLeaderList;

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

        @NameInMap("EnvList")
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoEnvList> envList;

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

        public static GetBizUnitInfoResponseBodyBizUnitInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBizUnitInfoResponseBodyBizUnitInfo self = new GetBizUnitInfoResponseBodyBizUnitInfo();
            return TeaModel.build(map, self);
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setAccountList(java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoAccountList> accountList) {
            this.accountList = accountList;
            return this;
        }
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoAccountList> getAccountList() {
            return this.accountList;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setBizObjectCount(Integer bizObjectCount) {
            this.bizObjectCount = bizObjectCount;
            return this;
        }
        public Integer getBizObjectCount() {
            return this.bizObjectCount;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setBizProcessCount(Integer bizProcessCount) {
            this.bizProcessCount = bizProcessCount;
            return this;
        }
        public Integer getBizProcessCount() {
            return this.bizProcessCount;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setBusinessLeaderList(java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList> businessLeaderList) {
            this.businessLeaderList = businessLeaderList;
            return this;
        }
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoBusinessLeaderList> getBusinessLeaderList() {
            return this.businessLeaderList;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setDataDomainCount(Integer dataDomainCount) {
            this.dataDomainCount = dataDomainCount;
            return this;
        }
        public Integer getDataDomainCount() {
            return this.dataDomainCount;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setDataLeaderList(java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList> dataLeaderList) {
            this.dataLeaderList = dataLeaderList;
            return this;
        }
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoDataLeaderList> getDataLeaderList() {
            return this.dataLeaderList;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setEnvList(java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoEnvList> envList) {
            this.envList = envList;
            return this;
        }
        public java.util.List<GetBizUnitInfoResponseBodyBizUnitInfoEnvList> getEnvList() {
            return this.envList;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBizUnitInfoResponseBodyBizUnitInfo setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

    }

}
