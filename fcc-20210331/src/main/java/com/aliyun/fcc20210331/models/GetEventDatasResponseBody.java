// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventDatasResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetEventDatasResponseBodyData data;

    public static GetEventDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventDatasResponseBody self = new GetEventDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventDatasResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetEventDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventDatasResponseBody setData(GetEventDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventDatasResponseBodyData getData() {
        return this.data;
    }

    public static class GetEventDatasResponseBodyDataResult extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("CameraId")
        public String cameraId;

        @NameInMap("SourceImageSize")
        public String sourceImageSize;

        @NameInMap("BizDay")
        public String bizDay;

        @NameInMap("EdgeDeviceId")
        public String edgeDeviceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("IsvId")
        public String isvId;

        @NameInMap("EdgeDeviceName")
        public String edgeDeviceName;

        @NameInMap("CameraName")
        public String cameraName;

        @NameInMap("SquareList")
        public String squareList;

        @NameInMap("SourceImageUrl")
        public String sourceImageUrl;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("TargetImageUrl")
        public String targetImageUrl;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("PersonNum")
        public Integer personNum;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("AreaList")
        public String areaList;

        @NameInMap("ProcessCreateTime")
        public String processCreateTime;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("DbCreateTime")
        public String dbCreateTime;

        @NameInMap("SourceCreateTime")
        public String sourceCreateTime;

        public static GetEventDatasResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetEventDatasResponseBodyDataResult self = new GetEventDatasResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetEventDatasResponseBodyDataResult setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetEventDatasResponseBodyDataResult setCameraId(String cameraId) {
            this.cameraId = cameraId;
            return this;
        }
        public String getCameraId() {
            return this.cameraId;
        }

        public GetEventDatasResponseBodyDataResult setSourceImageSize(String sourceImageSize) {
            this.sourceImageSize = sourceImageSize;
            return this;
        }
        public String getSourceImageSize() {
            return this.sourceImageSize;
        }

        public GetEventDatasResponseBodyDataResult setBizDay(String bizDay) {
            this.bizDay = bizDay;
            return this;
        }
        public String getBizDay() {
            return this.bizDay;
        }

        public GetEventDatasResponseBodyDataResult setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public GetEventDatasResponseBodyDataResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetEventDatasResponseBodyDataResult setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetEventDatasResponseBodyDataResult setEdgeDeviceName(String edgeDeviceName) {
            this.edgeDeviceName = edgeDeviceName;
            return this;
        }
        public String getEdgeDeviceName() {
            return this.edgeDeviceName;
        }

        public GetEventDatasResponseBodyDataResult setCameraName(String cameraName) {
            this.cameraName = cameraName;
            return this;
        }
        public String getCameraName() {
            return this.cameraName;
        }

        public GetEventDatasResponseBodyDataResult setSquareList(String squareList) {
            this.squareList = squareList;
            return this;
        }
        public String getSquareList() {
            return this.squareList;
        }

        public GetEventDatasResponseBodyDataResult setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public GetEventDatasResponseBodyDataResult setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetEventDatasResponseBodyDataResult setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public GetEventDatasResponseBodyDataResult setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetEventDatasResponseBodyDataResult setPersonNum(Integer personNum) {
            this.personNum = personNum;
            return this;
        }
        public Integer getPersonNum() {
            return this.personNum;
        }

        public GetEventDatasResponseBodyDataResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetEventDatasResponseBodyDataResult setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public GetEventDatasResponseBodyDataResult setAreaList(String areaList) {
            this.areaList = areaList;
            return this;
        }
        public String getAreaList() {
            return this.areaList;
        }

        public GetEventDatasResponseBodyDataResult setProcessCreateTime(String processCreateTime) {
            this.processCreateTime = processCreateTime;
            return this;
        }
        public String getProcessCreateTime() {
            return this.processCreateTime;
        }

        public GetEventDatasResponseBodyDataResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetEventDatasResponseBodyDataResult setDbCreateTime(String dbCreateTime) {
            this.dbCreateTime = dbCreateTime;
            return this;
        }
        public String getDbCreateTime() {
            return this.dbCreateTime;
        }

        public GetEventDatasResponseBodyDataResult setSourceCreateTime(String sourceCreateTime) {
            this.sourceCreateTime = sourceCreateTime;
            return this;
        }
        public String getSourceCreateTime() {
            return this.sourceCreateTime;
        }

    }

    public static class GetEventDatasResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Result")
        public java.util.List<GetEventDatasResponseBodyDataResult> result;

        public static GetEventDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventDatasResponseBodyData self = new GetEventDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventDatasResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public GetEventDatasResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetEventDatasResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetEventDatasResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetEventDatasResponseBodyData setResult(java.util.List<GetEventDatasResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetEventDatasResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
