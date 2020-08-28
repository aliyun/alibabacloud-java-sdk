// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetRadioRunHistoryTimeSerRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Start")
    @Validation(required = true)
    public Long start;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    @NameInMap("End")
    @Validation(required = true)
    public Long end;

    public static GetRadioRunHistoryTimeSerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRadioRunHistoryTimeSerRequest self = new GetRadioRunHistoryTimeSerRequest();
        return TeaModel.build(map, self);
    }

}
