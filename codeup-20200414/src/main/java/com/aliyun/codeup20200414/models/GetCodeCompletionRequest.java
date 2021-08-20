// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetCodeCompletionRequest extends TeaModel {
    @NameInMap("FetchKeys")
    public String fetchKeys;

    @NameInMap("IsEncrypted")
    public Boolean isEncrypted;

    public static GetCodeCompletionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeCompletionRequest self = new GetCodeCompletionRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeCompletionRequest setFetchKeys(String fetchKeys) {
        this.fetchKeys = fetchKeys;
        return this;
    }
    public String getFetchKeys() {
        return this.fetchKeys;
    }

    public GetCodeCompletionRequest setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
        return this;
    }
    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }

}
