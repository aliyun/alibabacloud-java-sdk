// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class SaveMgsApirestResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public SaveMgsApirestResponseResultContent resultContent;

    public static SaveMgsApirestResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMgsApirestResponse self = new SaveMgsApirestResponse();
        return TeaModel.build(map, self);
    }

    public static class SaveMgsApirestResponseResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Value")
        @Validation(required = true)
        public Boolean value;

        public static SaveMgsApirestResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            SaveMgsApirestResponseResultContent self = new SaveMgsApirestResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
