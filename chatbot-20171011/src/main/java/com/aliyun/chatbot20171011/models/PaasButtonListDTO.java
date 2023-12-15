// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasButtonListDTO extends TeaModel {
    @NameInMap("Button")
    public java.util.List<PaasButtonDTO> button;

    @NameInMap("Intro")
    public String intro;

    public static PaasButtonListDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasButtonListDTO self = new PaasButtonListDTO();
        return TeaModel.build(map, self);
    }

    public PaasButtonListDTO setButton(java.util.List<PaasButtonDTO> button) {
        this.button = button;
        return this;
    }
    public java.util.List<PaasButtonDTO> getButton() {
        return this.button;
    }

    public PaasButtonListDTO setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

}
