// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAccessDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallAccessDetailResponseBody body;

    public static DescribeVpcFirewallAccessDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAccessDetailResponse self = new DescribeVpcFirewallAccessDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAccessDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallAccessDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallAccessDetailResponse setBody(DescribeVpcFirewallAccessDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallAccessDetailResponseBody getBody() {
        return this.body;
    }

}
