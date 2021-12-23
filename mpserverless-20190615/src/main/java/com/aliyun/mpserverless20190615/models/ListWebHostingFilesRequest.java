// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingFilesRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("SpaceId")
    public String spaceId;

    public static ListWebHostingFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingFilesRequest self = new ListWebHostingFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListWebHostingFilesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListWebHostingFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWebHostingFilesRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListWebHostingFilesRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
