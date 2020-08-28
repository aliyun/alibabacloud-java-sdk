// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageRequest extends TeaModel {
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
    public java.util.List<RecolorHDImageRequestColorTemplate> colorTemplate;

    @NameInMap("Degree")
    @Validation(required = true)
    public String degree;

    public static RecolorHDImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageRequest self = new RecolorHDImageRequest();
        return TeaModel.build(map, self);
    }

    public static class RecolorHDImageRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorHDImageRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageRequestColorTemplate self = new RecolorHDImageRequestColorTemplate();
            return TeaModel.build(map, self);
        }

    }

}
