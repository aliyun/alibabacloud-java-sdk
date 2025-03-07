// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaLiveInputRequest extends TeaModel {
    /**
     * <p>The ID of the input.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("InputId")
    public String inputId;

    public static DeleteMediaLiveInputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaLiveInputRequest self = new DeleteMediaLiveInputRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaLiveInputRequest setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

}
