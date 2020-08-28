// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    @NameInMap("Addr")
    @Validation(required = true)
    public java.util.List<UpdateGtmAddressPoolRequestAddr> addr;

    public static UpdateGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAddressPoolRequest self = new UpdateGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateGtmAddressPoolRequestAddr extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        public static UpdateGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmAddressPoolRequestAddr self = new UpdateGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

    }

}
