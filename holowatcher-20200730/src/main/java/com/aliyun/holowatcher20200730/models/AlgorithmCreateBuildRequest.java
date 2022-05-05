// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCreateBuildRequest extends TeaModel {
    @NameInMap("Gender")
    public String gender;

    @NameInMap("Image")
    public String image;

    public static AlgorithmCreateBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCreateBuildRequest self = new AlgorithmCreateBuildRequest();
        return TeaModel.build(map, self);
    }

    public AlgorithmCreateBuildRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public AlgorithmCreateBuildRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
