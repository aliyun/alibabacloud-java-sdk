// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RefUrl")
    public String refUrl;

    @NameInMap("ColorCount")
    public Integer colorCount;

    @NameInMap("ColorTemplate")
    public java.util.List<RecolorImageRequestColorTemplate> colorTemplate;

    public static RecolorImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageRequest self = new RecolorImageRequest();
        return TeaModel.build(map, self);
    }

    public static class RecolorImageRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorImageRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorImageRequestColorTemplate self = new RecolorImageRequestColorTemplate();
            return TeaModel.build(map, self);
        }

    }

}
