// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameCcuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DataList")
    public java.util.List<GetGameCcuResponseBodyDataList> dataList;

    public static GetGameCcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameCcuResponseBody self = new GetGameCcuResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameCcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameCcuResponseBody setDataList(java.util.List<GetGameCcuResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<GetGameCcuResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class GetGameCcuResponseBodyDataList extends TeaModel {
        @NameInMap("GameId")
        public String gameId;

        @NameInMap("Ccu")
        public Long ccu;

        @NameInMap("RegionId")
        public String regionId;

        public static GetGameCcuResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetGameCcuResponseBodyDataList self = new GetGameCcuResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetGameCcuResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetGameCcuResponseBodyDataList setCcu(Long ccu) {
            this.ccu = ccu;
            return this;
        }
        public Long getCcu() {
            return this.ccu;
        }

        public GetGameCcuResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
