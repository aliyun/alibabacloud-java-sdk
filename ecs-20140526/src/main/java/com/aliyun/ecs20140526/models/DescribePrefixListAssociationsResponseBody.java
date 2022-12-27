// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListAssociationsResponseBody extends TeaModel {
    // The query token returned in this call. If the return value is empty, no more data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // Details about the resources that are associated with the prefix list.
    @NameInMap("PrefixListAssociations")
    public DescribePrefixListAssociationsResponseBodyPrefixListAssociations prefixListAssociations;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrefixListAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListAssociationsResponseBody self = new DescribePrefixListAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrefixListAssociationsResponseBody setPrefixListAssociations(DescribePrefixListAssociationsResponseBodyPrefixListAssociations prefixListAssociations) {
        this.prefixListAssociations = prefixListAssociations;
        return this;
    }
    public DescribePrefixListAssociationsResponseBodyPrefixListAssociations getPrefixListAssociations() {
        return this.prefixListAssociations;
    }

    public DescribePrefixListAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation extends TeaModel {
        // The ID of the resource.
        @NameInMap("ResourceId")
        public String resourceId;

        // The type of the resource.
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation self = new DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribePrefixListAssociationsResponseBodyPrefixListAssociations extends TeaModel {
        @NameInMap("PrefixListAssociation")
        public java.util.List<DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation> prefixListAssociation;

        public static DescribePrefixListAssociationsResponseBodyPrefixListAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAssociationsResponseBodyPrefixListAssociations self = new DescribePrefixListAssociationsResponseBodyPrefixListAssociations();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAssociationsResponseBodyPrefixListAssociations setPrefixListAssociation(java.util.List<DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation> prefixListAssociation) {
            this.prefixListAssociation = prefixListAssociation;
            return this;
        }
        public java.util.List<DescribePrefixListAssociationsResponseBodyPrefixListAssociationsPrefixListAssociation> getPrefixListAssociation() {
            return this.prefixListAssociation;
        }

    }

}
