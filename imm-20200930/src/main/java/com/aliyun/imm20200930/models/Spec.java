// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Spec extends TeaModel {
    /**
     * <p>The custom parameters for model training.</p>
     */
    @NameInMap("Backbone")
    public CustomParams backbone;

    /**
     * <p>The number of output classes of the last layer.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ClassNum")
    public Long classNum;

    /**
     * <p>The custom parameters for model training.</p>
     */
    @NameInMap("Head")
    public CustomParams head;

    /**
     * <p>3</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InputChannel")
    public Long inputChannel;

    /**
     * <p>The custom parameters for model training.</p>
     */
    @NameInMap("Loss")
    public CustomParams loss;

    /**
     * <p>The name of the model. The available model names vary with the model category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClsResNet</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom parameters for model training.</p>
     */
    @NameInMap("Neck")
    public CustomParams neck;

    /**
     * <p>The number of face landmarks. This parameter is required for face detection. In most cases, you can set the parameter to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NumLandmarks")
    public Long numLandmarks;

    /**
     * <p>The path to the pretrained model.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/abc/xxx.json</p>
     */
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
