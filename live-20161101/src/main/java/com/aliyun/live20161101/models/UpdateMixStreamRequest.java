// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("MixStreamId")
    public String mixStreamId;

    @NameInMap("InputStreamList")
    public String inputStreamList;

    @NameInMap("LayoutId")
    public String layoutId;

    public static UpdateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamRequest self = new UpdateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateMixStreamRequest setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
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

}
