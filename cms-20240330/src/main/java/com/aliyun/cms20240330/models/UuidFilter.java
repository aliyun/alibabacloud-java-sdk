// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UuidFilter extends TeaModel {
    /**
     * <p>The exact match condition for the alert rule UUID. Only the alert rule whose UUID equals the specified value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
     */
    @NameInMap("eq")
    public String eq;

    /**
     * <p>The set match condition for alert rule UUIDs. All alert rules whose UUIDs are in the specified list are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;b2c3d4e5-f6a7-8901-bcde-f12345678901&quot;]</p>
     */
    @NameInMap("in")
    public java.util.List<String> in;

    public static UuidFilter build(java.util.Map<String, ?> map) throws Exception {
        UuidFilter self = new UuidFilter();
        return TeaModel.build(map, self);
    }

    public UuidFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

    public UuidFilter setIn(java.util.List<String> in) {
        this.in = in;
        return this;
    }
    public java.util.List<String> getIn() {
        return this.in;
    }

}
