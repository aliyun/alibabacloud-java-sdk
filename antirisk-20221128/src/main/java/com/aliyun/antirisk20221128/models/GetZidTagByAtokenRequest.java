// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagByAtokenRequest extends TeaModel {
    @NameInMap("atoken")
    public String atoken;

    @NameInMap("channel")
    public String channel;

    @NameInMap("dataSourceId")
    public String dataSourceId;

    public static GetZidTagByAtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagByAtokenRequest self = new GetZidTagByAtokenRequest();
        return TeaModel.build(map, self);
    }

    public GetZidTagByAtokenRequest setAtoken(String atoken) {
        this.atoken = atoken;
        return this;
    }
    public String getAtoken() {
        return this.atoken;
    }

    public GetZidTagByAtokenRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetZidTagByAtokenRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
