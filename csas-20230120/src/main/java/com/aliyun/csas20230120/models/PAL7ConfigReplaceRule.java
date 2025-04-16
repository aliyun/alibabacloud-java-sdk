// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class PAL7ConfigReplaceRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <strong>example:</strong>
     * <p>bbb</p>
     */
    @NameInMap("To")
    public String to;

    public static PAL7ConfigReplaceRule build(java.util.Map<String, ?> map) throws Exception {
        PAL7ConfigReplaceRule self = new PAL7ConfigReplaceRule();
        return TeaModel.build(map, self);
    }

    public PAL7ConfigReplaceRule setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public PAL7ConfigReplaceRule setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
