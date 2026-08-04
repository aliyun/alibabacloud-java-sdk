// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwareForUserDeviceRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 10,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the user device. Call one of the following operations to obtain the device ID:</p>
     * <ul>
     * <li><p><a href="~~GetUserDevice~~">GetUserDevice</a>: Get the details of a user device.</p>
     * </li>
     * <li><p><a href="~~ListUserDevices~~">ListUserDevices</a>: Get a list of user devices.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DeviceTag")
    public String deviceTag;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
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
