// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameCcuResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<GetGameCcuResponseDataList> dataList;

    public static GetGameCcuResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameCcuResponse self = new GetGameCcuResponse();
        return TeaModel.build(map, self);
    }

    public GetGameCcuResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameCcuResponse setDataList(java.util.List<GetGameCcuResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<GetGameCcuResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class GetGameCcuResponseDataList extends TeaModel {
        @NameInMap("Ccu")
        @Validation(required = true)
        public Long ccu;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static GetGameCcuResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetGameCcuResponseDataList self = new GetGameCcuResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetGameCcuResponseDataList setCcu(Long ccu) {
            this.ccu = ccu;
            return this;
        }
        public Long getCcu() {
            return this.ccu;
        }

        public GetGameCcuResponseDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetGameCcuResponseDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
