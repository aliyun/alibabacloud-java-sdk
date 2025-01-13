// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FAFCD152-4791-5F2F-B0BE-2DC06FD4F05B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryRoomStatusResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QueryRoomStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomStatusResponseBody self = new QueryRoomStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRoomStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRoomStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRoomStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRoomStatusResponseBody setResult(QueryRoomStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryRoomStatusResponseBodyResult getResult() {
        return this.result;
    }

    public QueryRoomStatusResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QueryRoomStatusResponseBodyResultSceneList extends TeaModel {
        @NameInMap("SceneName")
        public String sceneName;

        public static QueryRoomStatusResponseBodyResultSceneList build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomStatusResponseBodyResultSceneList self = new QueryRoomStatusResponseBodyResultSceneList();
            return TeaModel.build(map, self);
        }

        public QueryRoomStatusResponseBodyResultSceneList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class QueryRoomStatusResponseBodyResultStatusList extends TeaModel {
        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("StatusValue")
        public String statusValue;

        /**
         * <strong>example:</strong>
         * <p>Thu Jan 09 13:56:51 CST 2025</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryRoomStatusResponseBodyResultStatusList build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomStatusResponseBodyResultStatusList self = new QueryRoomStatusResponseBodyResultStatusList();
            return TeaModel.build(map, self);
        }

        public QueryRoomStatusResponseBodyResultStatusList setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public QueryRoomStatusResponseBodyResultStatusList setStatusValue(String statusValue) {
            this.statusValue = statusValue;
            return this;
        }
        public String getStatusValue() {
            return this.statusValue;
        }

        public QueryRoomStatusResponseBodyResultStatusList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryRoomStatusResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cf2446fc9d144c85aaee4f9ae20a96e7</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        /**
         * <strong>example:</strong>
         * <p>1211</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("SceneList")
        public java.util.List<QueryRoomStatusResponseBodyResultSceneList> sceneList;

        @NameInMap("StatusList")
        public java.util.List<QueryRoomStatusResponseBodyResultStatusList> statusList;

        public static QueryRoomStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomStatusResponseBodyResult self = new QueryRoomStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryRoomStatusResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public QueryRoomStatusResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public QueryRoomStatusResponseBodyResult setSceneList(java.util.List<QueryRoomStatusResponseBodyResultSceneList> sceneList) {
            this.sceneList = sceneList;
            return this;
        }
        public java.util.List<QueryRoomStatusResponseBodyResultSceneList> getSceneList() {
            return this.sceneList;
        }

        public QueryRoomStatusResponseBodyResult setStatusList(java.util.List<QueryRoomStatusResponseBodyResultStatusList> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<QueryRoomStatusResponseBodyResultStatusList> getStatusList() {
            return this.statusList;
        }

    }

}
