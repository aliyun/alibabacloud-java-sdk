// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasResponseNodeContentDTO extends TeaModel {
    @NameInMap("ButtonList")
    public PaasButtonListDTO buttonList;

    @NameInMap("Image")
    public String image;

    @NameInMap("Text")
    public String text;

    @NameInMap("Type")
    public String type;

    public static PaasResponseNodeContentDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasResponseNodeContentDTO self = new PaasResponseNodeContentDTO();
        return TeaModel.build(map, self);
    }

    public PaasResponseNodeContentDTO setButtonList(PaasButtonListDTO buttonList) {
        this.buttonList = buttonList;
        return this;
    }
    public PaasButtonListDTO getButtonList() {
        return this.buttonList;
    }

    public PaasResponseNodeContentDTO setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PaasResponseNodeContentDTO setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PaasResponseNodeContentDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
