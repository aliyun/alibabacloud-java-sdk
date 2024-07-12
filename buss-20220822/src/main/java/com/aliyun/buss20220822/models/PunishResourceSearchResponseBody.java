// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class PunishResourceSearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public java.util.List<PunishResourceSearchResponseBodyDataList> dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ViewCount")
    public Integer viewCount;

    public static PunishResourceSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PunishResourceSearchResponseBody self = new PunishResourceSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public PunishResourceSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PunishResourceSearchResponseBody setDataList(java.util.List<PunishResourceSearchResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<PunishResourceSearchResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public PunishResourceSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PunishResourceSearchResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public PunishResourceSearchResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public PunishResourceSearchResponseBody setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    public Integer getViewCount() {
        return this.viewCount;
    }

    public static class PunishResourceSearchResponseBodyDataList extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("Class")
        public String _class;

        @NameInMap("Coordinate")
        public String coordinate;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Extras")
        public String extras;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("ObjectValue")
        public String objectValue;

        @NameInMap("PunishFrom")
        public String punishFrom;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RequestId")
        public Long requestId;

        @NameInMap("SourceCode")
        public String sourceCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        @NameInMap("UserId")
        public String userId;

        public static PunishResourceSearchResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            PunishResourceSearchResponseBodyDataList self = new PunishResourceSearchResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public PunishResourceSearchResponseBodyDataList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public PunishResourceSearchResponseBodyDataList setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public PunishResourceSearchResponseBodyDataList set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public PunishResourceSearchResponseBodyDataList setCoordinate(String coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public String getCoordinate() {
            return this.coordinate;
        }

        public PunishResourceSearchResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public PunishResourceSearchResponseBodyDataList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PunishResourceSearchResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public PunishResourceSearchResponseBodyDataList setExtras(String extras) {
            this.extras = extras;
            return this;
        }
        public String getExtras() {
            return this.extras;
        }

        public PunishResourceSearchResponseBodyDataList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public PunishResourceSearchResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PunishResourceSearchResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PunishResourceSearchResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PunishResourceSearchResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public PunishResourceSearchResponseBodyDataList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public PunishResourceSearchResponseBodyDataList setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public PunishResourceSearchResponseBodyDataList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public PunishResourceSearchResponseBodyDataList setObjectValue(String objectValue) {
            this.objectValue = objectValue;
            return this;
        }
        public String getObjectValue() {
            return this.objectValue;
        }

        public PunishResourceSearchResponseBodyDataList setPunishFrom(String punishFrom) {
            this.punishFrom = punishFrom;
            return this;
        }
        public String getPunishFrom() {
            return this.punishFrom;
        }

        public PunishResourceSearchResponseBodyDataList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public PunishResourceSearchResponseBodyDataList setRequestId(Long requestId) {
            this.requestId = requestId;
            return this;
        }
        public Long getRequestId() {
            return this.requestId;
        }

        public PunishResourceSearchResponseBodyDataList setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public PunishResourceSearchResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PunishResourceSearchResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public PunishResourceSearchResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
