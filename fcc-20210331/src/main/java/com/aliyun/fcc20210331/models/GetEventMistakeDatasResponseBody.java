// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventMistakeDatasResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetEventMistakeDatasResponseBodyData data;

    public static GetEventMistakeDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventMistakeDatasResponseBody self = new GetEventMistakeDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventMistakeDatasResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetEventMistakeDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventMistakeDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventMistakeDatasResponseBody setData(GetEventMistakeDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventMistakeDatasResponseBodyData getData() {
        return this.data;
    }

    public static class GetEventMistakeDatasResponseBodyDataResult extends TeaModel {
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

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("AreaList")
        public String areaList;

        @NameInMap("ProcessCreateTime")
        public String processCreateTime;

        @NameInMap("DbCreateTime")
        public String dbCreateTime;

        @NameInMap("SourceCreateTime")
        public String sourceCreateTime;

        public static GetEventMistakeDatasResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetEventMistakeDatasResponseBodyDataResult self = new GetEventMistakeDatasResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetEventMistakeDatasResponseBodyDataResult setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetEventMistakeDatasResponseBodyDataResult setCameraId(String cameraId) {
            this.cameraId = cameraId;
            return this;
        }
        public String getCameraId() {
            return this.cameraId;
        }

        public GetEventMistakeDatasResponseBodyDataResult setSourceImageSize(String sourceImageSize) {
            this.sourceImageSize = sourceImageSize;
            return this;
        }
        public String getSourceImageSize() {
            return this.sourceImageSize;
        }

        public GetEventMistakeDatasResponseBodyDataResult setBizDay(String bizDay) {
            this.bizDay = bizDay;
            return this;
        }
        public String getBizDay() {
            return this.bizDay;
        }

        public GetEventMistakeDatasResponseBodyDataResult setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public GetEventMistakeDatasResponseBodyDataResult setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetEventMistakeDatasResponseBodyDataResult setEdgeDeviceName(String edgeDeviceName) {
            this.edgeDeviceName = edgeDeviceName;
            return this;
        }
        public String getEdgeDeviceName() {
            return this.edgeDeviceName;
        }

        public GetEventMistakeDatasResponseBodyDataResult setCameraName(String cameraName) {
            this.cameraName = cameraName;
            return this;
        }
        public String getCameraName() {
            return this.cameraName;
        }

        public GetEventMistakeDatasResponseBodyDataResult setSquareList(String squareList) {
            this.squareList = squareList;
            return this;
        }
        public String getSquareList() {
            return this.squareList;
        }

        public GetEventMistakeDatasResponseBodyDataResult setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public GetEventMistakeDatasResponseBodyDataResult setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetEventMistakeDatasResponseBodyDataResult setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public GetEventMistakeDatasResponseBodyDataResult setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetEventMistakeDatasResponseBodyDataResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetEventMistakeDatasResponseBodyDataResult setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public GetEventMistakeDatasResponseBodyDataResult setAreaList(String areaList) {
            this.areaList = areaList;
            return this;
        }
        public String getAreaList() {
            return this.areaList;
        }

        public GetEventMistakeDatasResponseBodyDataResult setProcessCreateTime(String processCreateTime) {
            this.processCreateTime = processCreateTime;
            return this;
        }
        public String getProcessCreateTime() {
            return this.processCreateTime;
        }

        public GetEventMistakeDatasResponseBodyDataResult setDbCreateTime(String dbCreateTime) {
            this.dbCreateTime = dbCreateTime;
            return this;
        }
        public String getDbCreateTime() {
            return this.dbCreateTime;
        }

        public GetEventMistakeDatasResponseBodyDataResult setSourceCreateTime(String sourceCreateTime) {
            this.sourceCreateTime = sourceCreateTime;
            return this;
        }
        public String getSourceCreateTime() {
            return this.sourceCreateTime;
        }

    }

    public static class GetEventMistakeDatasResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Result")
        public java.util.List<GetEventMistakeDatasResponseBodyDataResult> result;

        public static GetEventMistakeDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventMistakeDatasResponseBodyData self = new GetEventMistakeDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventMistakeDatasResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public GetEventMistakeDatasResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetEventMistakeDatasResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetEventMistakeDatasResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetEventMistakeDatasResponseBodyData setResult(java.util.List<GetEventMistakeDatasResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetEventMistakeDatasResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
