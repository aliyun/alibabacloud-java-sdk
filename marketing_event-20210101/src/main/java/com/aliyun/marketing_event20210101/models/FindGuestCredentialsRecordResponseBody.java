// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestCredentialsRecordResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<FindGuestCredentialsRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>25294484-D133-5BDC-8952-243AD90CDF66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FindGuestCredentialsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindGuestCredentialsRecordResponseBody self = new FindGuestCredentialsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public FindGuestCredentialsRecordResponseBody setData(java.util.List<FindGuestCredentialsRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FindGuestCredentialsRecordResponseBodyData> getData() {
        return this.data;
    }

    public FindGuestCredentialsRecordResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public FindGuestCredentialsRecordResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public FindGuestCredentialsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindGuestCredentialsRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        /**
         * <strong>example:</strong>
         * <p>buc_396545</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner self = new FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        /**
         * <strong>example:</strong>
         * <p>buc_160953</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner self = new FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        /**
         * <strong>example:</strong>
         * <p>buc_87239</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>hBCycGELqJd6LEqSWKiLCQ==</p>
         */
        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner self = new FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1401</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("LevelOneChannelName")
        public String levelOneChannelName;

        @NameInMap("LevelOneOwner")
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner> levelOneOwner;

        @NameInMap("LevelThreeChannelName")
        public String levelThreeChannelName;

        @NameInMap("LevelThreeOwner")
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> levelThreeOwner;

        @NameInMap("LevelTwoChannelName")
        public String levelTwoChannelName;

        @NameInMap("LevelTwoOwner")
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> levelTwoOwner;

        public static FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo build(java.util.Map<String, ?> map) throws Exception {
            FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo self = new FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo();
            return TeaModel.build(map, self);
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelOneChannelName(String levelOneChannelName) {
            this.levelOneChannelName = levelOneChannelName;
            return this;
        }
        public String getLevelOneChannelName() {
            return this.levelOneChannelName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelOneOwner(java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner> levelOneOwner) {
            this.levelOneOwner = levelOneOwner;
            return this;
        }
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelOneOwner> getLevelOneOwner() {
            return this.levelOneOwner;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelThreeChannelName(String levelThreeChannelName) {
            this.levelThreeChannelName = levelThreeChannelName;
            return this;
        }
        public String getLevelThreeChannelName() {
            return this.levelThreeChannelName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelThreeOwner(java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> levelThreeOwner) {
            this.levelThreeOwner = levelThreeOwner;
            return this;
        }
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> getLevelThreeOwner() {
            return this.levelThreeOwner;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelTwoChannelName(String levelTwoChannelName) {
            this.levelTwoChannelName = levelTwoChannelName;
            return this;
        }
        public String getLevelTwoChannelName() {
            return this.levelTwoChannelName;
        }

        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo setLevelTwoOwner(java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> levelTwoOwner) {
            this.levelTwoOwner = levelTwoOwner;
            return this;
        }
        public java.util.List<FindGuestCredentialsRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> getLevelTwoOwner() {
            return this.levelTwoOwner;
        }

    }

    public static class FindGuestCredentialsRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Admin")
        public java.util.Map<String, ?> admin;

        /**
         * <strong>example:</strong>
         * <p>1401</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("ChannelLevelInfo")
        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo channelLevelInfo;

        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <strong>example:</strong>
         * <p>3602-10010215</p>
         */
        @NameInMap("CredentialsCode")
        public String credentialsCode;

        @NameInMap("CredentialsName")
        public String credentialsName;

        /**
         * <strong>example:</strong>
         * <p>IjEqZpp8Wn29+sqOr3hxXuOqn6CyKYNSQ5dmMA0txiM=</p>
         */
        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static FindGuestCredentialsRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindGuestCredentialsRecordResponseBodyData self = new FindGuestCredentialsRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindGuestCredentialsRecordResponseBodyData setAdmin(java.util.Map<String, ?> admin) {
            this.admin = admin;
            return this;
        }
        public java.util.Map<String, ?> getAdmin() {
            return this.admin;
        }

        public FindGuestCredentialsRecordResponseBodyData setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public FindGuestCredentialsRecordResponseBodyData setChannelLevelInfo(FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo channelLevelInfo) {
            this.channelLevelInfo = channelLevelInfo;
            return this;
        }
        public FindGuestCredentialsRecordResponseBodyDataChannelLevelInfo getChannelLevelInfo() {
            return this.channelLevelInfo;
        }

        public FindGuestCredentialsRecordResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public FindGuestCredentialsRecordResponseBodyData setCredentialsCode(String credentialsCode) {
            this.credentialsCode = credentialsCode;
            return this;
        }
        public String getCredentialsCode() {
            return this.credentialsCode;
        }

        public FindGuestCredentialsRecordResponseBodyData setCredentialsName(String credentialsName) {
            this.credentialsName = credentialsName;
            return this;
        }
        public String getCredentialsName() {
            return this.credentialsName;
        }

        public FindGuestCredentialsRecordResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public FindGuestCredentialsRecordResponseBodyData setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindGuestCredentialsRecordResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindGuestCredentialsRecordResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
