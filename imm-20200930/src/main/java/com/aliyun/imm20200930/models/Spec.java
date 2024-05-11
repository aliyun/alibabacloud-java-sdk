// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Spec extends TeaModel {
    @NameInMap("Backbone")
    public CustomParams backbone;

    @NameInMap("ClassNum")
    public Long classNum;

    @NameInMap("Head")
    public CustomParams head;

    @NameInMap("InputChannel")
    public Long inputChannel;

    @NameInMap("Loss")
    public CustomParams loss;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Neck")
    public CustomParams neck;

    @NameInMap("NumLandmarks")
    public Long numLandmarks;

    @NameInMap("PretrainedPath")
    public String pretrainedPath;

    public static Spec build(java.util.Map<String, ?> map) throws Exception {
        Spec self = new Spec();
        return TeaModel.build(map, self);
    }

    public Spec setBackbone(CustomParams backbone) {
        this.backbone = backbone;
        return this;
    }
    public CustomParams getBackbone() {
        return this.backbone;
    }

    public Spec setClassNum(Long classNum) {
        this.classNum = classNum;
        return this;
    }
    public Long getClassNum() {
        return this.classNum;
    }

    public Spec setHead(CustomParams head) {
        this.head = head;
        return this;
    }
    public CustomParams getHead() {
        return this.head;
    }

    public Spec setInputChannel(Long inputChannel) {
        this.inputChannel = inputChannel;
        return this;
    }
    public Long getInputChannel() {
        return this.inputChannel;
    }

    public Spec setLoss(CustomParams loss) {
        this.loss = loss;
        return this;
    }
    public CustomParams getLoss() {
        return this.loss;
    }

    public Spec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Spec setNeck(CustomParams neck) {
        this.neck = neck;
        return this;
    }
    public CustomParams getNeck() {
        return this.neck;
    }

    public Spec setNumLandmarks(Long numLandmarks) {
        this.numLandmarks = numLandmarks;
        return this;
    }
    public Long getNumLandmarks() {
        return this.numLandmarks;
    }

    public Spec setPretrainedPath(String pretrainedPath) {
        this.pretrainedPath = pretrainedPath;
        return this;
    }
    public String getPretrainedPath() {
        return this.pretrainedPath;
    }

}
