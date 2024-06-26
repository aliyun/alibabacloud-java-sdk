// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwareForUserDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DeviceTag")
    public String deviceTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListSoftwareForUserDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwareForUserDeviceRequest self = new ListSoftwareForUserDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListSoftwareForUserDeviceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSoftwareForUserDeviceRequest setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }
    public String getDeviceTag() {
        return this.deviceTag;
    }

    public ListSoftwareForUserDeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
