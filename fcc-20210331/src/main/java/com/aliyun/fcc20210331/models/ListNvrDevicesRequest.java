// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrDevicesRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("IsPage")
    public Long isPage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListNvrDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNvrDevicesRequest self = new ListNvrDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListNvrDevicesRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public ListNvrDevicesRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public ListNvrDevicesRequest setIsPage(Long isPage) {
        this.isPage = isPage;
        return this;
    }
    public Long getIsPage() {
        return this.isPage;
    }

    public ListNvrDevicesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListNvrDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
