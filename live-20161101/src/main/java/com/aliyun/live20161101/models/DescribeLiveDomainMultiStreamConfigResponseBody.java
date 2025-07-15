// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMultiStreamConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F486A44F-6B35-5A96-BF2C-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the dual-stream disaster recovery feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static DescribeLiveDomainMultiStreamConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMultiStreamConfigResponseBody self = new DescribeLiveDomainMultiStreamConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMultiStreamConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainMultiStreamConfigResponseBody set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
