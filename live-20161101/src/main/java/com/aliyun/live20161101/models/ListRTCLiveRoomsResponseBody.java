// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRTCLiveRoomsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rooms")
    public java.util.List<String> rooms;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListRTCLiveRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRTCLiveRoomsResponseBody self = new ListRTCLiveRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRTCLiveRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRTCLiveRoomsResponseBody setRooms(java.util.List<String> rooms) {
        this.rooms = rooms;
        return this;
    }
    public java.util.List<String> getRooms() {
        return this.rooms;
    }

    public ListRTCLiveRoomsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
