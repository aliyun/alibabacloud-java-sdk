// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrChannelDevicesRequest extends TeaModel {
    @NameInMap("IsPage")
    public Integer isPage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListNvrChannelDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNvrChannelDevicesRequest self = new ListNvrChannelDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListNvrChannelDevicesRequest setIsPage(Integer isPage) {
        this.isPage = isPage;
        return this;
    }
    public Integer getIsPage() {
        return this.isPage;
    }

    public ListNvrChannelDevicesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListNvrChannelDevicesRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public ListNvrChannelDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
