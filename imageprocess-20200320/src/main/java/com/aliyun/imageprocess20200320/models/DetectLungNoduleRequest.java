// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleRequest extends TeaModel {
    @NameInMap("URLList")
    @Validation(required = true)
    public java.util.List<DetectLungNoduleRequestURLList> URLList;

    public static DetectLungNoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleRequest self = new DetectLungNoduleRequest();
        return TeaModel.build(map, self);
    }

    public static class DetectLungNoduleRequestURLList extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static DetectLungNoduleRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleRequestURLList self = new DetectLungNoduleRequestURLList();
            return TeaModel.build(map, self);
        }

    }

}
