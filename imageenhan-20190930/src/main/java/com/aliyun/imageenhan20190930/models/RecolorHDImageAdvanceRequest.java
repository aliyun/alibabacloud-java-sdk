// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RefUrl")
    public String refUrl;

    @NameInMap("ColorCount")
    public Integer colorCount;

    @NameInMap("ColorTemplate")
    public java.util.List<RecolorHDImageAdvanceRequestColorTemplate> colorTemplate;

    @NameInMap("Degree")
    @Validation(required = true)
    public String degree;

    public static RecolorHDImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageAdvanceRequest self = new RecolorHDImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public static class RecolorHDImageAdvanceRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorHDImageAdvanceRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageAdvanceRequestColorTemplate self = new RecolorHDImageAdvanceRequestColorTemplate();
            return TeaModel.build(map, self);
        }

    }

}
