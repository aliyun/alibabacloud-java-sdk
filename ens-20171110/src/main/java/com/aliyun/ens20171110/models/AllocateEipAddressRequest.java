// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("MinCount")
    public Integer minCount;

    @NameInMap("Version")
    public String version;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AllocateEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public AllocateEipAddressRequest setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public AllocateEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
