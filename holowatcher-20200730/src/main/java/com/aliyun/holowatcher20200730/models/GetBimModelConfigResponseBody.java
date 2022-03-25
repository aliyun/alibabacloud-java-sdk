// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimModelConfigResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimModelConfigResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimModelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimModelConfigResponseBody self = new GetBimModelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimModelConfigResponseBody setDatas(GetBimModelConfigResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimModelConfigResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimModelConfigResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimModelConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimModelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimModelConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimModelConfigResponseBodyDatas extends TeaModel {
        // 梁高
        @NameInMap("BeamHeight")
        public Long beamHeight;

        // 梁模式
        @NameInMap("BeamMode")
        public Long beamMode;

        // 梁偏移
        @NameInMap("BeamOffset")
        public Long beamOffset;

        // 门高
        @NameInMap("DoorHeight")
        public Long doorHeight;

        // 门偏移
        @NameInMap("DoorOffset")
        public Long doorOffset;

        // 模型规则id
        @NameInMap("Id")
        public Long id;

        // 房间模式
        @NameInMap("RoomMode")
        public Long roomMode;

        // 板模式
        @NameInMap("SlabMode")
        public Long slabMode;

        // 板厚度
        @NameInMap("SlabThickness")
        public Long slabThickness;

        // 窗高
        @NameInMap("WindowHeight")
        public Long windowHeight;

        // 窗偏移量
        @NameInMap("WindowOffset")
        public Long windowOffset;

        public static GetBimModelConfigResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimModelConfigResponseBodyDatas self = new GetBimModelConfigResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimModelConfigResponseBodyDatas setBeamHeight(Long beamHeight) {
            this.beamHeight = beamHeight;
            return this;
        }
        public Long getBeamHeight() {
            return this.beamHeight;
        }

        public GetBimModelConfigResponseBodyDatas setBeamMode(Long beamMode) {
            this.beamMode = beamMode;
            return this;
        }
        public Long getBeamMode() {
            return this.beamMode;
        }

        public GetBimModelConfigResponseBodyDatas setBeamOffset(Long beamOffset) {
            this.beamOffset = beamOffset;
            return this;
        }
        public Long getBeamOffset() {
            return this.beamOffset;
        }

        public GetBimModelConfigResponseBodyDatas setDoorHeight(Long doorHeight) {
            this.doorHeight = doorHeight;
            return this;
        }
        public Long getDoorHeight() {
            return this.doorHeight;
        }

        public GetBimModelConfigResponseBodyDatas setDoorOffset(Long doorOffset) {
            this.doorOffset = doorOffset;
            return this;
        }
        public Long getDoorOffset() {
            return this.doorOffset;
        }

        public GetBimModelConfigResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimModelConfigResponseBodyDatas setRoomMode(Long roomMode) {
            this.roomMode = roomMode;
            return this;
        }
        public Long getRoomMode() {
            return this.roomMode;
        }

        public GetBimModelConfigResponseBodyDatas setSlabMode(Long slabMode) {
            this.slabMode = slabMode;
            return this;
        }
        public Long getSlabMode() {
            return this.slabMode;
        }

        public GetBimModelConfigResponseBodyDatas setSlabThickness(Long slabThickness) {
            this.slabThickness = slabThickness;
            return this;
        }
        public Long getSlabThickness() {
            return this.slabThickness;
        }

        public GetBimModelConfigResponseBodyDatas setWindowHeight(Long windowHeight) {
            this.windowHeight = windowHeight;
            return this;
        }
        public Long getWindowHeight() {
            return this.windowHeight;
        }

        public GetBimModelConfigResponseBodyDatas setWindowOffset(Long windowOffset) {
            this.windowOffset = windowOffset;
            return this;
        }
        public Long getWindowOffset() {
            return this.windowOffset;
        }

    }

}
