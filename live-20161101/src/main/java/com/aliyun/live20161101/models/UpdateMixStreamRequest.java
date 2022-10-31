// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InputStreamList")
    public String inputStreamList;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("MixStreamId")
    public String mixStreamId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UpdateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamRequest self = new UpdateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateMixStreamRequest setInputStreamList(String inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    public UpdateMixStreamRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public UpdateMixStreamRequest setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public UpdateMixStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
