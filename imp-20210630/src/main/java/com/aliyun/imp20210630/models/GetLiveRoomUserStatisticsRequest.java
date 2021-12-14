// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomUserStatisticsRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    // 查询页码，从1开始，传空默认查询第1页。
    @NameInMap("PageNumber")
    public String pageNumber;

    // 每页显示个数，最大支持50，参数为空默认显示个数为10。
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static GetLiveRoomUserStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomUserStatisticsRequest self = new GetLiveRoomUserStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomUserStatisticsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveRoomUserStatisticsRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public GetLiveRoomUserStatisticsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetLiveRoomUserStatisticsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLiveRoomUserStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
