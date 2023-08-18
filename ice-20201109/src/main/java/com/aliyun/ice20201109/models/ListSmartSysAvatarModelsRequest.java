// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartSysAvatarModelsRequest extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SdkVersion")
    public String sdkVersion;

    public static ListSmartSysAvatarModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartSysAvatarModelsRequest self = new ListSmartSysAvatarModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartSysAvatarModelsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListSmartSysAvatarModelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSmartSysAvatarModelsRequest setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

}
