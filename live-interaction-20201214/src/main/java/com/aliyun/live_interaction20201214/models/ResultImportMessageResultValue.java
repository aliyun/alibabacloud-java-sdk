// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ResultImportMessageResultValue extends TeaModel {
    @NameInMap("result")
    public Long result;

    @NameInMap("msgId")
    public String msgId;

    public static ResultImportMessageResultValue build(java.util.Map<String, ?> map) throws Exception {
        ResultImportMessageResultValue self = new ResultImportMessageResultValue();
        return TeaModel.build(map, self);
    }

    public ResultImportMessageResultValue setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public ResultImportMessageResultValue setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
