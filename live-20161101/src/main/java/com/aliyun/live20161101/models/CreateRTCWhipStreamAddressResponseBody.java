// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRTCWhipStreamAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>58E7<strong>D4-xxxx-xxxx-xxxx-6B5</strong>6Cxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxx.media-sh.xxxxx.com/xxxxxxxxxxxx/3723a3xxxxxxxxx223c606b***5f7a2bc7c56ea5cdd0xxxxe?auth_key=17495xxxxx-xxxx-0-f013003067c78c4053f9cd0xxxxxxx&qqzr=H4sIAAAAAAAC_6pWSlayUkrOMxxxxxxrPyCxQ0lFKQTCLlKyUjM2Nj**NDQ1TEy2Mjc3xxxxxxxxxxqRYAAAD__xxxxx__xxxxxxxx">https://xxxxxx.media-sh.xxxxx.com/xxxxxxxxxxxx/3723a3xxxxxxxxx223c606b***5f7a2bc7c56ea5cdd0xxxxe?auth_key=17495xxxxx-xxxx-0-f013003067c78c4053f9cd0xxxxxxx&amp;qqzr=H4sIAAAAAAAC_6pWSlayUkrOMxxxxxxrPyCxQ0lFKQTCLlKyUjM2Nj**NDQ1TEy2Mjc3xxxxxxxxxxqRYAAAD__xxxxx__xxxxxxxx</a></p>
     */
    @NameInMap("WhipAddress")
    public String whipAddress;

    public static CreateRTCWhipStreamAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRTCWhipStreamAddressResponseBody self = new CreateRTCWhipStreamAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRTCWhipStreamAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRTCWhipStreamAddressResponseBody setWhipAddress(String whipAddress) {
        this.whipAddress = whipAddress;
        return this;
    }
    public String getWhipAddress() {
        return this.whipAddress;
    }

}
