// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("Uuid")
    @Validation(required = true)
    public String uuid;

    @NameInMap("Token")
    @Validation(required = true)
    public String token;

    @NameInMap("Size")
    public String size;

    @NameInMap("Type")
    public String type;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("WordVectorDelimiter")
    public String wordVectorDelimiter;

    @NameInMap("WordDelimiter")
    public String wordDelimiter;

    public static GetWeChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWeChEcomRequest self = new GetWeChEcomRequest();
        return TeaModel.build(map, self);
    }

}
