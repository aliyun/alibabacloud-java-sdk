// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LocationStorageRankDTO extends TeaModel {
    @NameInMap("FileCnt")
    public Long fileCnt;

    @NameInMap("Location")
    public String location;

    @NameInMap("Storage")
    public Long storage;

    public static LocationStorageRankDTO build(java.util.Map<String, ?> map) throws Exception {
        LocationStorageRankDTO self = new LocationStorageRankDTO();
        return TeaModel.build(map, self);
    }

    public LocationStorageRankDTO setFileCnt(Long fileCnt) {
        this.fileCnt = fileCnt;
        return this;
    }
    public Long getFileCnt() {
        return this.fileCnt;
    }

    public LocationStorageRankDTO setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public LocationStorageRankDTO setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

}
