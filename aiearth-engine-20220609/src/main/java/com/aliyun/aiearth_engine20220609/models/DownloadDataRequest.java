// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DownloadDataRequest extends TeaModel {
    @NameInMap("BandNo")
    public String bandNo;

    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("DataId")
    public String dataId;

    public static DownloadDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataRequest self = new DownloadDataRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDataRequest setBandNo(String bandNo) {
        this.bandNo = bandNo;
        return this;
    }
    public String getBandNo() {
        return this.bandNo;
    }

    public DownloadDataRequest setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public DownloadDataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
