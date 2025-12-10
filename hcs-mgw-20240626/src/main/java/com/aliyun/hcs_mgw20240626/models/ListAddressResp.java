// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAddressResp extends TeaModel {
    @NameInMap("ImportAddress")
    public java.util.List<GetAddressResp> importAddress;

    /**
     * <strong>example:</strong>
     * <your-next-address-name>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Truncated")
    public Boolean truncated;

    public static ListAddressResp build(java.util.Map<String, ?> map) throws Exception {
        ListAddressResp self = new ListAddressResp();
        return TeaModel.build(map, self);
    }

    public ListAddressResp setImportAddress(java.util.List<GetAddressResp> importAddress) {
        this.importAddress = importAddress;
        return this;
    }
    public java.util.List<GetAddressResp> getImportAddress() {
        return this.importAddress;
    }

    public ListAddressResp setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListAddressResp setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
